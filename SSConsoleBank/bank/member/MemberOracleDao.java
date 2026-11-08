package bank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bank.util.DbUtil;

public class MemberOracleDao implements MemberDao {

    /*
     * Oracle에 J_MEMBER 테이블이 없을 때 사용할 생성문 예시
     *
     * CREATE TABLE j_member (
     *     id       VARCHAR2(30 CHAR) PRIMARY KEY,
     *     password VARCHAR2(100 CHAR) NOT NULL,
     *     name     VARCHAR2(50 CHAR) NOT NULL,
     *     email    VARCHAR2(100 CHAR),
     *     mobile   VARCHAR2(20 CHAR),
     *     type     CHAR(1) NOT NULL CHECK (type IN ('A', 'U'))
     * );
     */

    @Override
    public boolean save(Member member) {
        String sql = "INSERT INTO j_member (id, password, name, email, mobile, type) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, member.getId());
            stmt.setString(2, member.getPassword());
            stmt.setString(3, member.getName());
            stmt.setString(4, member.getEmail());
            stmt.setString(5, member.getMobile());
            stmt.setString(6, String.valueOf(member.getType()));
            return stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new IllegalStateException("Oracle 회원 등록 중 오류가 발생했습니다.", e);
        }
    }

    @Override
    public List<Member> findAll() {
        String sql = "SELECT id, password, name, email, mobile, type FROM j_member";
        List<Member> members = new ArrayList<>();

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                members.add(readMember(rs));
            }
            return members.isEmpty() ? null : members;
        } catch (SQLException e) {
            throw new IllegalStateException("Oracle 회원 목록 조회 중 오류가 발생했습니다.", e);
        }
    }

    @Override
    public Member findById(String id) {
        String sql = "SELECT id, password, name, email, mobile, type FROM j_member WHERE id = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return readMember(rs);
                }
                return null;
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Oracle 회원 조회 중 오류가 발생했습니다.", e);
        }
    }

    @Override
    public boolean update(Member member) {
        String sql = "UPDATE j_member SET password = ?, name = ?, email = ?, mobile = ?, type = ? WHERE id = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, member.getPassword());
            stmt.setString(2, member.getName());
            stmt.setString(3, member.getEmail());
            stmt.setString(4, member.getMobile());
            stmt.setString(5, String.valueOf(member.getType()));
            stmt.setString(6, member.getId());
            return stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new IllegalStateException("Oracle 회원 수정 중 오류가 발생했습니다.", e);
        }
    }

    @Override
    public boolean delete(Member member) {
        String sql = "DELETE FROM j_member WHERE id = ?";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, member.getId());
            return stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new IllegalStateException("Oracle 회원 삭제 중 오류가 발생했습니다.", e);
        }
    }

    private Member readMember(ResultSet rs) throws SQLException {
        return new Member(
                rs.getString("id"),
                rs.getString("password"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("mobile"),
                rs.getString("type").charAt(0)
        );
    }
}
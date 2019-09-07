package se.iuh.minhkha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import se.iuh.minhkha.entity.NhanVien;

@Repository
public class NhanVienDao {
	@Autowired
	private JdbcTemplate template;
	public List<NhanVien> dsNhanVien(){
		String sql="SELECT * FROM NhanVien";
		return template.query(sql, new RowMapper<NhanVien>() {

			@Override
			public NhanVien mapRow(ResultSet rs, int rowNum) throws SQLException {
				NhanVien nv = new NhanVien();
				nv.setMaNV(rs.getInt(1));
				nv.setTenNV(rs.getString(2).trim());
				nv.setCmnd(rs.getString(3).trim());
				nv.setGioitinh(rs.getString(4).trim());
				return nv;
			}
			
		});
	}
	public int xoaNV(int maNV) {
		String sql = "DELETE FROM NhanVien WHERE maNV = "+maNV;
		return template.update(sql);
	}
	public int themNV(NhanVien nv) {
		String sql="insert into NhanVien values("+nv.getMaNV()+",'"+nv.getTenNV()+"','"+nv.getCmnd()+"','"+nv.getGioitinh()+"')";
		return template.update(sql);
	}
	
}

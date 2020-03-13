package spring_aop_5.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import spring_aop_5.bean.User;
import spring_aop_5.dao.UserDao;

//使用JDBC模板实现增删改查
//@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

//	@Autowired
//	@Qualifier("jdbcTemplate")
//	@Resource(name="jdbcTemplate")
//	private JdbcTemplate jt;
	
//	@Resource(name="dataSource")
//	@Autowired
//	private ComboPooledDataSource dataSource;
//	
//	public void setComboPooledDataSource(ComboPooledDataSource comboPooledDataSource) {
//		this.dataSource = comboPooledDataSource;
//	}


	@Override
	public void save(User u) {
		String sql = "insert into t_user values(null,?)";
		super.getJdbcTemplate().update(sql, u.getName());
	}

	
	@Override
	public void delete(Integer id) {
		String sql = "delete from t_user where id = ?";
		super.getJdbcTemplate().update(sql,id);
	}

	@Override
	public void update(User u) {
		String sql = "update t_user set name = ? where id = ?";
		super.getJdbcTemplate().update(sql, u.getName(),u.getId());
	}

	@Override
	public User getById(Integer id) {
		
		String sql = "select * from t_user where id = ?";
		return super.getJdbcTemplate().queryForObject(sql, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				return user;
			}
		}, id);
	}

	@Override
	public int getTotalCount() {
		String sql = "select count(*) from t_user";
		Integer count = super.getJdbcTemplate().queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public List<User> getAll() {
		String sql = "select * from t_user";
		List<User> list = super.getJdbcTemplate().query(sql, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}
			
		});
		return list;
	}

}

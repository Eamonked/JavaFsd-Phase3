package spring.test.spring_test;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDao {
	
	private JdbcTemplate jdbcTemplate;

	public CustomerDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveCustomer(Customer c) {
		String query = "insert into customer values('"+ c.getId() + "','" + c.getFirstname()+"','"+ c.getLastname()+"')";
		return jdbcTemplate.update(query);
	}
	
	

}

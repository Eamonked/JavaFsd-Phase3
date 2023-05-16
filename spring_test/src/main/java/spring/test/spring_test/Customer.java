package spring.test.spring_test;

public class Customer {

		private int id;
		
		private String firstname;
		private String lastname;
		@Override
		public String toString() {
			return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public Customer(int id, String firstname, String lastname) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
		}
		
		
}

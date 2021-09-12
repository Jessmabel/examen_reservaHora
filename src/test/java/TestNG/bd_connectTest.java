package TestNG;

import static org.junit.Assert.fail;
import java.sql.Connection;
import org.testng.annotations.Test;
import common_things.DB_Connection;

public class bd_connectTest {
public  String r;
Connection con=null;
DB_Connection db = new DB_Connection();
	@Test
	public void test() {
		con=db.getConnection();
		if (con.equals(null)) {
			fail("conexion fallida");
		}else {
			 System.out.println("conexion exitosa");
		}
	}
}



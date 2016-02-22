//import java.sql.Connection;
//import java.sql.Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
//import java.util.Collection;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Baths on 17.02.2016.
 */
public class FunnyDB  {
    public static Connection getDbConn() throws SQLException {
        Connection conn = mock(Connection.class);
        Statement st = mock(Statement.class);
        when(conn.createStatement()).thenReturn(st);
        ResultSet rs = mock(ResultSet.class);
        when(st.executeQuery(anyString())).thenReturn(rs);
        when(rs.next()).thenReturn(true, true, true, false);
        when(rs.getString("id")).thenReturn("1", "2", "3");
        when(rs.getString("name")).thenReturn("Nail", "Alex", "Liya");
        return conn;
    }
}

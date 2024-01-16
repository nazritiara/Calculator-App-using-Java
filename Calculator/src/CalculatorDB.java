
import java.sql.Connection;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class CalculatorDB {
    public static int insert(int numb1, int numb2, int result, String operator){
        int status = 0;
        try
	{
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into expression(numb1,numb2,result,operator) values(?,?,?,?)");
            ps.setInt(1,numb1);
            ps.setInt(2,numb2);
            ps.setInt(3,result);
            ps.setString(4,operator);
            

            status = ps.executeUpdate();
            con.close();
	}
	catch(Exception e){
            System.out.println(e);
	}
        return status;
    }
}

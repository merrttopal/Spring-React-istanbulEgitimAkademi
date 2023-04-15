import models.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductService {
    DB db = new DB();
    public int save(Product product){
        int status = 0;
        Connection connection = db.getConnect();
        try {
            String sql = "insert into product values (null,?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getTitle());
            preparedStatement.setInt(2,product.getPrice());
            status = preparedStatement.executeUpdate();

        }catch (Exception exception){
            System.err.println(exception);
        }finally {
            db.close();
        }
        return status;
    }
}

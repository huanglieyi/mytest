package com.shineyue.cn.mytest.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.apache.logging.log4j.message.Message;

import com.shineyue.cn.mytest.entity.User;

public interface MessageDao {


	@SelectProvider(type = Message.class,method = "getUser")
	User getOne(@Param("userid")Integer userid);

	public class Message{
		public String getUser(Map<String,Object> para) {
			SQL sql = new SQL();
			sql.SELECT("userid","username","age","birth");
			sql.FROM("test");
			sql.WHERE("userid="+para.get("userid"));
			return sql.toString();
		}




	}

}





//@Select("<script>select userid,username,age from test</script>")
//@Results({
//	@Result(propert="userid",column="userid"),
//	@Result(propert="username",column="username"),
//	@Result(propert="age",column="age")
//})

//	@SelectProvider(type=Message.class,method="methods")
//	User method(@Param("userid")Integer userid);
//	
//	public static String methods(Map<String,Object> para) {
//		SQL sql =new SQL();
//		sql.SELECT("userid","username","age","birth");
//		sql.FROM("test");
//		sql.WHERE("userid="+para.get("userid"));
//		return sql.toString();
//		
//	}



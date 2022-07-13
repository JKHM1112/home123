<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<%!
Connection conn=null;
PreparedStatement pstmt = null;

String url = "jdbc:oracle:thin:@localhost:1521:xe";
String uid = "scott";
String pass = "tiger";

String sql = "insert into item values (?,?,?)";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

String name = request.getParameter("name");
String price= request.getParameter("price");
String description = request.getParameter("description");


try {
   //1단계  드라이버로드
   Class.forName("oracle.jdbc.driver.OracleDriver");
   //2 
   conn = DriverManager.getConnection(url,uid,pass);
   
   pstmt=conn.prepareStatement(sql);
   
   pstmt.setString(1,name);
   pstmt.setString(2,price);
   pstmt.setString(3,description);

   //
   pstmt.executeUpdate();
}catch(Exception e){
   e.printStackTrace();
}finally{
   //
   try{
      if(pstmt != null) pstmt.close();
      if(conn != null) conn.close();
   }catch(Exception e){
      e.printStackTrace();
   }
   
}
%>
<h3>회원 가입 성공</h3>
<a href="itemWrite.jsp">상품 전체목록보기</a>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <%!
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null ;
    // String url = "jdbc:oracle:thin:@:XE";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";  //암기할것
    String uid = "scott";
    String pass = "tiger";
    String sql = "select * from item";
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
<table width="800" border="1">
<tr>
<th>상품명</th>
<th>가격</th>
<th>설명</th>
</tr>
<%
try{
   //1. 드라이브로드   
   Class.forName("oracle.jdbc.driver.OracleDriver");
   //2. 연결
   conn = DriverManager.getConnection(url,uid,pass);
   //3. sql문장 작성
   stmt= conn.createStatement();
   //4. sql문 실행
   rs = stmt.executeQuery(sql);
   //5. 실행된 결과물을 rs를 통해서 출력 
   while(rs.next()){
      out.println("<tr>");
      out.println("<td>" + rs.getString("name")+"</td>");
      out.println("<td>" + rs.getString("price")+"</td>");
      out.println("<td>" + rs.getString("description")+"</td>");

      out.println("</tr>");
      
   } //while 끝
      
}catch(Exception e){
   e.printStackTrace();
}finally{
   try{
   if(rs !=null) rs.close();
   if(stmt != null) stmt.close();
   if(conn != null) conn.close();
}catch(Exception e){
   e.printStackTrace();
}
}
%>
</table>

</body>
</html>
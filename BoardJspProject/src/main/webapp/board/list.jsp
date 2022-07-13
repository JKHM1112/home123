<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import=" java.util.*, com.it.dao.*, java.text.* " %>

<jsp:useBean id="dao" class="com.it.dao.BoardDAO"/>

<%
   //1. 사용자 입력값 받기(page)
   String strpage = request.getParameter("page");	//현재 나의 페이지
   if(strpage == null) {
      strpage = "1";
   }
   int curpage = Integer.parseInt(strpage);
   
   //2. 데이타베이스로 부터 데이터를 읽어 온다 ┌결과물 가져오는거
   List<BoardVO> list = dao.boardListData(curpage);
   int totalPage = dao.boardTotalPage();	//이놈이 BoardDAO 꺼에서 total을 받아온다.

   String name = request.getParameter("search");	//현재 나의 페이지
   if(name != null) {
	   list = dao.searchListData(curpage, name);
   }
   

   
   //페이지 나누기
   final int BLOCK =3;
   int startPage = ( (curpage-1)/BLOCK*BLOCK ) + 1;  // (1)1  (2) 1/3*3+1 = 2  페이지 내에서 시작되는 페이지 아래칸
   int endPage = ( (curpage-1)/BLOCK*BLOCK ) +BLOCK; //    3      1/3*3+3 = 4  페이지 내에서 끝나는 페이지 아래칸
   
   if(endPage>totalPage)
      endPage = totalPage;	//3까지 인데 2page까지 있으면 1,2 page만 있다.
   
   //오늘 날짜
   String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());	//시간 받아오는 것
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
<style type="text/css">
   .container{
      margin-top: 50px;
   }
   .input-group{
	   margin: 0px auto;
	   width : 960px;
   }
   
   .row{
      margin: 0px auto;
      width : 960px;
   }
   
   h1{
      text-align: center;
   }
</style>
</head>
<body>
   <div class="container">
   <form action="list.jsp">
    <div class="input-group">
      <input type="text" class="form-control" placeholder="Search" name="search">
      <div class="input-group-btn">
        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
      </div>
    </div>
  </form>
      <h1>자유게시판</h1>
      <div class="row">
         <table class="table">
            <tr> <td> <a href="insert.jsp" class="btn btn-sm btn-success">새글</a> </td> </tr>
         </table>
         
         <table class="table">
            <tr class="danger">
               <th class="text-center" width=10%>번호</th>
               <th class="text-center" width=45%>제목</th>
               <th class="text-center" width=15%>이름</th>
               <th class="text-center" width=20%>작성일</th>
               <th class="text-center" width=10%>조회수</th>
            </tr>
            <%
               for(BoardVO vo : list){//82 vo
            %>
            <tr>
               <td class="text-center" width=10%><%=vo.getNo() %></td>	<!-- vo -->
               <td width=45%>
                  <a href="detail.jsp?no=<%=vo.getNo()%>"><%=vo.getSubject() %></a>&nbsp;
                  <sup style="color:red">new</sup>
               </td>
               
               <td class="text-center" width=15%><%=vo.getName() %></td>
               <td class="text-center" width=20%><%=vo.getDbday() %></td>
               <td class="text-center" width=10%><%=vo.getHit() %></td>
            </tr>
            <%      
               }
            %>
         </table>
      </div>
      
      <div class="row">
         <div class="text-center">
            <ul class="pagination">
              <%
                 if(startPage > 1) { //1, 4, 7
              %>   
                 <li><a href="list.jsp?page=<%=startPage-1%>">&lt;</a></li>
              <%
                 }
              %>
              
              <%
                 for(int i=startPage; i<=endPage; i++){
                    String act = "";
                    if(curpage == i)
                       act = "class=active";
                    else
                       act = "";
              %>
                 <li <%=act %>><a href="list.jsp?page=<%=i%>"><%=i%></a></li>
              <%
                 }
              %>
              
              <%
                 if(endPage < totalPage){
              %>
                 <li><a href="list.jsp?page=<%=endPage+1%>">&gt;</a></li>
              <%
                 }
              %>
            </ul>
         </div>
      </div>
   </div>
</body>
</html>
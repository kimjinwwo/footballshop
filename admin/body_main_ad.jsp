<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<%! String greeting = "세상에 없던 축구몰 ssacer";
      String tagline = "이벤트는 하단을 확인해 주세요";%>

    <div class="container">
	<div class="jumbotron">
		<div class="container">
			<h3 class="display-4">
				<%=greeting%>
            </h3>
		</div>
	</div>
<%
    ProductRepository dao = ProductRepository.getInstance();
	ArrayList<Product> listOfProducts = productDAO.getAllProducts(); // 리스트에 상품 전체 정보를 얻어온다.
%> 
<div class="container">
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
                                                    <div class="card bg-dark text-white">
                        <img src="img/product//<%=product.getFilename()%>.jpg" class="card-img" alt="...">
                        <div class="card-img-overlay">
                        <h5 class="card-title">대표이미지</h5>
                        <p class="card-text">출처 : 구글 검색</p>
                        </div>
                        </div>
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>원
                    <p><a href="product_detail_ad.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상품 상세 정보 &raquo;</a>

			</div>
			<%
				}
			%>
		</div>
		<hr>

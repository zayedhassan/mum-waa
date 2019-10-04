<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Save Product</title>
    <style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>

    <h5>Details:</h5>
    Product Name: ${product.name}<br/>
    Category: ${product.category.name}<br/>
    Description: ${product.description}<br/>
    Price: $${product.price}

<p>
    <spring:url value="/listproducts" var="product_url">
    </spring:url>
    <a href="${product_url}">
        <button>List products</button>
    </a>
</p>
</div>
</body>
</html>
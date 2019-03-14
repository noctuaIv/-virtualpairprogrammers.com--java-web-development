<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>

	<head>
		<link href="styles.css" rel="Stylesheet" type="text/css"/>
		<title>Add A New Book</title>
	</head>
	
	<body>
	
		<jsp:include page="/header.jsp"/>
	
		<h1><bean:message key="title.addbook"/></h1>
		
		<div id="addBook">
			<html:form action="/addNewBook.do">
				<label><bean:message key="book.isbn"/></label> <html:text property="isbn"/><p class="error"><html:errors property="isbn"/></p>
				<label><bean:message key="book.title"/></label> <html:text property="title"/><p class="error"><html:errors property="title"/></p>
				<label><bean:message key="book.author"/></label> <html:text property="author"/><p class="error"><html:errors property="author"/></p>
				<label><bean:message key="book.price"/></label> <html:text property="price"/><p class="error"><html:errors property="price"/></p>
				
				<p><input type="submit" value="<bean:message key="form.submit"/>"/></p>
			</html:form>
		</div>
		
	    <jsp:include page="/footer.jsp"/>
	</body>
</html>
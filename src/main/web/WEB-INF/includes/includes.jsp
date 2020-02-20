<%@page import="java.util.Locale"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@page session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="true" %>
<%@ page trimDirectiveWhitespaces="true" %>

<fmt:setLocale value="${Locale.getDefault()}" />
<fmt:bundle basename="java.i18n.applicationresources"/>

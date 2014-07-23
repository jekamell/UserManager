<%@ taglib prefix="s" uri="/struts-tags" %>
<legend>Add user</legend>

<s:fielderror />

<s:form method="POST" action="reg" theme="bootstrap" cssClass="form-horizontal">
    <s:textfield  name="userBean.login" label="login" />
    <s:submit/>
</s:form>
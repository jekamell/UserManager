<%@ taglib prefix="s" uri="/struts-tags" %>
<legend>Add user</legend>

<s:fielderror />

<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>
<s:fielderror theme="bootstrap"/>

<s:form method="POST" action="reg" theme="bootstrap" cssClass="form-horizontal">
    <s:textfield  name="userBean.login" label="login" />
    <s:submit/>
</s:form>
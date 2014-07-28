<%@ taglib prefix="s" uri="/struts-tags" %>
<legend>Add user</legend>


<s:form action="reg" theme="bootstrap" cssClass="form-horizontal">
    <s:textfield name="user.login" label="Username *"/>
    <s:password name="user.password" label="Password *"/>
    <s:password name="user.passwordRepeat" label="Password repeat *"/>
    <s:textfield name="user.nameFirst" label="First name"/>
    <s:textfield name="user.nameLast" label="Last name"/>
    <s:textfield name="user.email" label="E-mail"/>
    <s:textfield name="user.phoneNumber" label="Phone number"/>

    <s:submit cssClass="btn btn-primary"/>
    <a href="list" class="btn btn-default">Cancel</a>
</s:form>
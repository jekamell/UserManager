<%@ taglib prefix="s" uri="/struts-tags" %>
<legend>Update user</legend>


<s:form action="edit-user" theme="bootstrap" cssClass="form-horizontal">
    <s:hidden name="user.id" />
    <s:textfield name="user.nameFirst" label="First name"/>
    <s:textfield name="user.nameLast" label="Last name"/>
    <s:textfield name="user.email" label="E-mail"/>
    <s:textfield name="user.phoneNumber" label="Phone number"/>

    <s:submit cssClass="btn btn-primary"/>
    <a href="list" class="btn btn-default">Cancel</a>
</s:form>
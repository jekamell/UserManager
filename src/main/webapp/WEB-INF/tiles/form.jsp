<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="register">

    <s:textfield name="model.login" label="login" />
    <s:textfield  name="model.password" label="Password" />
    <s:textfield  name="model.nameFirst" label="First name" />
    <s:textfield  name="model.nameLast" label="Last name" />
    <s:textfield  name="model.email" label="E-mail" />
    <s:textfield  name="model.phoneNumber" label="Phone" />
    <s:submit/>

</s:form>
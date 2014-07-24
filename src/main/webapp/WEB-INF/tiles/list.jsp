<%@ taglib prefix="s" uri="/struts-tags" %>
<a href="add" class="btn btn-primary">Add user</a>
<h1>User list</h1>
<table class="table table-striped">
    <tr>
        <th>#</th>
        <th>login</th>
        <th>First name</th>
        <th>Last name</th>
        <th>E-mail</th>
        <th>Phone number</th>
        <th>Management</th>
    </tr>
<s:if test="%{getUsers.isEmpty()}">

</s:if>
<s:else>

    <s:iterator value="users">
        <tr>
            <td><s:property value="id" /></td>
            <td><s:property value="login" /></td>
            <td><s:property value="nameFirst" /></td>
            <td><s:property value="nameLast" /></td>
            <td><s:property value="email" /></td>
            <td><s:property value="phoneNumber" /></td>
            <td>
                <span class="glyphicon glyphicon-edit"></span>
                <span class="glyphicon glyphicon-trash"></span>
            </td>
        </tr>

    </s:iterator>
</s:else>
</table>
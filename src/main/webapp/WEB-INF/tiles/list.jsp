<%@ taglib prefix="s" uri="/struts-tags" %>
<legend>User list</legend>
<a href="add" class="btn btn-primary">Add user</a>
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
                <a href="/edit?id=<s:property value="id" />">
                    <span class="glyphicon glyphicon-edit"></span>
                </a>
                <a href="/delete?id=<s:property value="id" />">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
        </tr>

    </s:iterator>
</s:else>
</table>
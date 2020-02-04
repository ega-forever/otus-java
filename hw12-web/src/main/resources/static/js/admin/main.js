

document.addEventListener("DOMContentLoaded", function(event) {
    loadUsers();
});

async function loadUsers(){
    const userDataContainer = document.getElementById('content');
    const response = await fetch('api/admin/users');
    const users = await response.json();

    userDataContainer.innerHTML = '';
    users.forEach(user=>{
    userDataContainer.innerHTML += `
    <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.login}</td>
            <td>${user.role}</td>
    </tr>
    `});

}


async function addUser(){

    const nameField = document.getElementById('name');
    const loginField = document.getElementById('login');
    const passwordField = document.getElementById('password');
    const roleField = document.getElementById('role');


    await fetch('api/admin/user', {
        method: 'post',
        body: JSON.stringify({
            name: nameField.value,
            login: loginField.value,
            password: passwordField.value,
            role: role.value
        })
      });

    nameField.value = '';
    loginField.value = '';
    passwordField.value = '';
    roleField.value = '';

    await loadUsers();

}
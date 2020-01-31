

document.addEventListener("DOMContentLoaded", function(event) {
    loadUsers();
});

function loadUsers(){
    const userDataContainer = document.getElementById('content');
    //fetch('api/users')
    fetch('api/admin/users')
        .then(response => response.json())
        .then(users =>{

        userDataContainer.innerHTML = '';
        users.forEach(user=>{
        userDataContainer.innerHTML += `
        <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.login}</td>
                <td>${user.role}</td>
        </tr>
        `})});

}


function addUser(){

fetch('api/admin/user', {
    method: 'post',
    body: JSON.stringify({
        name: "john",
        login: "my_login",
        password: "123",
        role: "USER"
    })
  })

}
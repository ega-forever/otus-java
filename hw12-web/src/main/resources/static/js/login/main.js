document.addEventListener("DOMContentLoaded", function(event) {

    const paramsPairs = document.location.search.substr(1).split('&').map(item=>item.split('='))
    const redirect = paramsPairs.find(pair=>pair[0] === 'redirect');
    if(redirect){
        document.getElementById('redirect').value = redirect[1];
    }
});
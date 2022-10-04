window.addEventListener('load', () => {

    const params = (new URL(document.location)).searchParams;
    const fname = params.get('fname');
    const lname = params.get('lname');

    document.getElementById('result-fname').innerHTML = fname;
    document.getElementById('result-lname').innerHTML = lname;
})
function isValid(idForm) { 
  let retorno=true;
  document.querySelector(idForm).querySelectorAll('[validar="true"]').forEach(element => {
    if(element.value == ''){
      element.classList.add('is-invalid');
      return retorno = false;
    }
    element.classList.remove('is-invalid')
  });
  return retorno;
}
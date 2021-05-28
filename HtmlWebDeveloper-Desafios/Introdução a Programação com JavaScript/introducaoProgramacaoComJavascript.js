let idColaborador = parseInt(gets());
let horasTrabalhadas = parseFloat(gets());
let valorHora = parseFloat(gets());
let salario = parseFloat(horasTrabalhadas * valorHora).toFixed(2);
console.log("NUMBER = " + idColaborador);
console.log("SALARY = U$ " + salario);
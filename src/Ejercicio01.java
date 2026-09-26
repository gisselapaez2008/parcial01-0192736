import. java.util.Scanner;
public static void main(String[] args ) {
  
     const CANTIDAD_SECTORES = 10;
     const VALOR_MINIMO = 0;

     let consumos = new Array(CANTIDAD_SECTORES);
      let totalConsumo = 0;


for (let i = 0; i < CANTIDAD_SECTORES; i++) {
    let consumo;

    do {
        consumo = Number(prompt("Ingrese el consumo del sector " + (i + 1) + ":"));
    } while (consumo < VALOR_MINIMO || isNaN(consumo));

    consumos[i] = consumo;
    totalConsumo += consumo;
}


let promedioConsumo = totalConsumo / CANTIDAD_SECTORES;


let mayorConsumo = consumos[0];
let sectorMayorConsumo = 1;

for (let i = 1; i < CANTIDAD_SECTORES; i++) {
    if (consumos[i] > mayorConsumo) {
        mayorConsumo = consumos[i];
        sectorMayorConsumo = i + 1;
    }
}


let sectoresSobrePromedio = 0;

for (let i = 0; i < CANTIDAD_SECTORES; i++) {
    if (consumos[i] > promedioConsumo) {
        sectoresSobrePromedio++;
    }
}


let rachaActual = 0;
let rachaMayor = 0;

for (let i = 0; i < CANTIDAD_SECTORES; i++) {
    if (consumos[i] > promedioConsumo) {
        rachaActual++;

        if (rachaActual > rachaMayor) {
            rachaMayor = rachaActual;
        }
    } else {
        rachaActual = 0;
    }
}


console.log("===== RESULTADOS =====");
console.log("Consumo total: " + totalConsumo + " m³");
console.log("Promedio: " + promedioConsumo + " m³");
console.log("Sector con mayor consumo: " + sectorMayorConsumo);
console.log("Sectores sobre el promedio: " + sectoresSobrePromedio);
console.log("Racha más larga: " + rachaMayor);


console.log("===== LISTADO DE SECTORES =====");

for (let i = 0; i < CANTIDAD_SECTORES; i++) {
    console.log("Sector " + (i + 1) + ": " + consumos[i] + " m³");
}a
}


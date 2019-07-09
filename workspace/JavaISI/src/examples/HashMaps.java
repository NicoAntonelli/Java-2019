package examples;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*

Metodo #1: Iterando sobre las entradas usando For-Each.

Es el mas comun y el mas preferible en la mayoria de casos. Se suaria en el caso que necesites tanto valor como key.

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
Nota que el ciclo For-Each fue introducido en Java 5 por lo tanto solo funciona en las primeras versiones de java. Tambien el ciclo For-Each arrojaria NullPointerException si intentas iterar sobre un mapa nulo, por lo tanto siempre hay que revisar antes por referencias nulas.

Metodo #2: Iterando sobre las keys o values usando una ciclo For-Each.

Si solo necesitas o las keys o los values peudes usar keySet o values en lugar de entrySet.

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    //iterating over keys only
    for (Integer key : map.keySet()) {
        System.out.println("Key = " + key);
    }

//iterando solo sobre valores
for (Integer value : map.values()) {
    System.out.println("Value = " + value);
}
Este método da una leve ventaja en performance sobre la iteracion entrySet (cerca de 10% mas rapida) y es mas limpia.

Metodo #3: Iterando usando Iterator.

Usando Genericos:

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
while (entries.hasNext()) {
    Map.Entry<Integer, Integer> entry = entries.next();
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
Sin Genericos:

Map map = new HashMap();
Iterator entries = map.entrySet().iterator();
while (entries.hasNext()) {
    Map.Entry entry = (Map.Entry) entries.next();
    Integer key = (Integer)entry.getKey();
    Integer value = (Integer)entry.getValue();
    System.out.println("Key = " + key + ", Value = " + value);
}
Tambien puedes usar la misma tecnica para iterar sobre keySet o values.

Este metodo puede parecer redundante pero tiene sus ventajas. Primero que todo es la unica manera de iterar sobre mapas en versiones mas viejas de java. Otra caracteristica importante es que este es el unico metodo que te permite remover entradas del mapa durante la iteracion usando iterator.remove(). Si intentas hacer esto con una iteracion For-Each obtendras "resultados inpredecibles" de acuerdo con JavaDoc.

Desde el punto de vista del performance esta es lo mismo que una iteracion For-Each.

Metodo #4: Iterando sobre keys y buscando los values (ineficiente).

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (Integer key : map.keySet()) {
    Integer value = map.get(key);
    System.out.println("Key = " + key + ", Value = " + value);
}
Esta pareceria ser una alternativa mas limpia del metodo #1 pero en la practica es muy lenta e ineficiente obteniendo values por key podria consumir mucho tiempo (este metodo en diferentes implementaciones de Map es 20%-200% mas lento que el metodo #1). Si tienes FindBugs instalado, lo detectara y te avisara de una iteracion ineficiente. Este metodo debe ser evitado.

Conclusion:

Si solo quieres los keys o los values usa el metodo #2. Si estas atorado en alguna version vieja de java (menor a 5) o planeas remover las entradas durante la iteracoin usa el metodo #3. De cualquier otra manera usa el #1. 
  */
	
	}

}

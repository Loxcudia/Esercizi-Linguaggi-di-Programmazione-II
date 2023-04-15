Ipotizzando la disponibilità delle classi Person, Employee e Manager, ciascuna sottoclasse della
precedente, realizzare la classe Container in modo che il seguente frammento sia corretto:
Container<Employee> cont1 = new <String>Container<Employee>("ciao");
Container<Employee> cont2 = new <Integer>Container<Employee>(new Integer(42));
Container<Manager> cont3 = new <Integer>Container<Manager>(new Integer(42));
e ciascuna delle seguenti istruzioni provochi un errore di compilazione:
Container<Employee> cont4 = new <Object>Container<Employee>(new Object());
Container<Person> cont5 = new <Integer>Container<Person>(new Integer(42));
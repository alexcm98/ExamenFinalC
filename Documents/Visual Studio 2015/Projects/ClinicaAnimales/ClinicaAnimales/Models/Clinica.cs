using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ClinicaAnimales.Models;
using System.Collections;

namespace ClinicaAnimales.Models
{
    class Clinica
    {
      
        protected IList listaa { get; set; }

        public Clinica()
        { 
            listaa = new List<Animal>(); ;
        }

        public int Menu()
        {
            int caso;
            string opcion;
            bool error = true;

            do {
                Console.WriteLine("---------MENÚ-----------");
                Console.WriteLine("1. Añadir animal");
                Console.WriteLine("2. Modificar los comentarios");
                Console.WriteLine("3. Pesar Animal");
                Console.WriteLine("4. Mostrar Ficha");
                Console.WriteLine("5. Salir del programa");
                opcion = Console.ReadLine();



                if (Int32.TryParse(opcion, out caso))
                {
                    Int32.TryParse(opcion, out caso);
                    error = false;
                }

                if (caso < 1 || caso > 5)
                {
                    error = true;
                }
            } while (error);

            return caso;
        }



        public void Añadir()
        {
            int caso;
            string opcion;
            bool error = true;
            string nombre = "";
            string fecha ="";
           
            string comentario = "";
            string aux = "";

            do
            {
               Console.WriteLine("-----------SUBMENU--------------");
                Console.WriteLine("1- Perro");
                Console.WriteLine("2- Gato");
                Console.WriteLine("3- Pajaro");
                Console.WriteLine("4- Reptil");
                opcion = Console.ReadLine();

                if (Int32.TryParse(opcion, out caso))
                {
                    Int32.TryParse(opcion, out caso);
                    error = false;
                }

                if (caso < 1 || caso > 4)
                {
                    Console.WriteLine("Por favor seleccione una opcion");
                    error = true;
                }
            } while (error);

            Console.WriteLine("Nombre: ");
            nombre = Console.ReadLine();
            Console.WriteLine("Fecha: ");
            fecha = Console.ReadLine();
            Console.WriteLine("Comentario: ");
            comentario = Console.ReadLine();


            switch (caso)
            {

                case 1:
                    string raza = "";
                    string microchip = "";

                   Console.WriteLine("Raza: ");
                    raza = Console.ReadLine();
                    Console.WriteLine("Microchip");
                    microchip = Console.ReadLine();
                    Animal perro = new Perro(nombre, fecha, 0, comentario, raza, microchip);
                    listaa.Add(perro);
                    break;

                case 2:
                    string razag = "";
                    string microchipg = "";

                    Console.WriteLine("Raza: ");
                    razag = Console.ReadLine();
                    Console.WriteLine("Microchip");
                    microchipg = Console.ReadLine();
                    Animal gato = new Gato(nombre, fecha, 0, comentario, razag, microchipg);
                    listaa.Add(gato);
                    break;

                case 3:
                    string especie = "";
                    string aux1 = "";
                    bool cantor = false;

                    Console.WriteLine("Especie: ");
                    especie = Console.ReadLine();
                    do
                    {

                       Console.WriteLine("¿Es cantor?");
                       Console.WriteLine("Por favor, introduzca 'si' o 'no'");
                        aux1 = Console.ReadLine();
                        aux1.ToLower();
                        if (aux1.Equals("si"))
                        {
                            cantor = true;
                           Console.WriteLine("Realiza un canto magnifico");
                        }
                        if (aux1.Equals("no"))
                        {
                            cantor = false;

                        }
                    } while (!aux1.Equals("si") && !aux1.Equals("no"));

                    Animal pajaro = new Pajaro(nombre, fecha, 0, comentario, especie, cantor);
                    listaa.Add(pajaro);
                    break;

                case 4:

                    string especier = "";
                    string aux2 = "";
                    bool venenoso = false;

                    Console.WriteLine("Especie: ");
                    especier = Console.ReadLine();
                    do
                    {

                        Console.WriteLine("¿Es venenoso?");
                        Console.WriteLine("Por favor, introduzca 'si' o 'no'");
                        aux2 = Console.ReadLine();
                        aux2.ToLower();
                        if (aux2.Equals("si"))
                        {
                            venenoso = true;
                            Console.WriteLine("Realiza una picadura letal");
                        }
                        if (aux2.Equals("no"))
                        {
                            cantor = false;

                        }
                    } while (!aux2.Equals("si") && !aux2.Equals("no"));

                    Animal reptil = new Reptil(nombre, fecha, 0, comentario, especier, venenoso);
                    listaa.Add(reptil);

                    break;


            }



        }




        public void ModificarComentario()
        {
            int i = 1;
               if(listaa.Count == 0)
            {
                Console.WriteLine("La lista esta vacia");

            }
                
                foreach (Animal animal in listaa)
                {
                    Console.WriteLine(i + "." + animal.Nombre + " Comentario: " + animal.Comentario);
                    i++;
                }

            ImplementarModificacion();

            }


        public void ImplementarModificacion()
        {
            //variables//
            int opcion = 0;
            string aux = "";
            bool error1 = true;
            string comentario;
            //procesos//
            do
            {
               Console.WriteLine("¿Que comentario quieres modificar?");
                aux = Console.ReadLine();
              if(Int32.TryParse(aux,out opcion)) {
                    Int32.TryParse(aux, out opcion);
                    error1 = false;
                }
                else
                {
                   Console.WriteLine("[ERROR] al elegir opcion");
                    error1 = true;
                }
            } while (error1 || opcion < 1 );

           Console.WriteLine("Escribe el nuevo comentario");
            comentario = Console.ReadLine();

            
            //no se como modificar un atributo de un objeto
           

        }


        public void PesarAnimal()
        {

            int i = 1;
            if (listaa.Count == 0)
            {
                Console.WriteLine("La lista esta vacia");

            }

            foreach (Animal animal in listaa)
            {
                Console.WriteLine(i + "." + animal.Nombre + " Peso: " + animal.Peso);
                i++;
            }

            
            


        }


        public void MostrarFicha()
        {

            int i = 1;
            if (listaa.Count == 0)
            {
                Console.WriteLine("La lista esta vacia");

            }

            foreach (Animal animal in listaa)
            {
                Console.WriteLine(i + "." + animal.Nombre );
                i++;
            }

            Console.WriteLine();




        }

    }
}

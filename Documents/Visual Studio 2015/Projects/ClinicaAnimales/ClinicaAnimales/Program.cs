using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ClinicaAnimales.Models;

namespace ClinicaAnimales
{
    class Program
    {
        static void Main(string[] args)
        {
            //No    manejar arrayList y no he sido capaz de modifar comentarios,mostar la ficha aunque estan los metodos hechos
           
            Clinica c = new Clinica();
            int opcion = 0;

            do {
                opcion = c.Menu();


                switch (opcion)
                {

                    case 1:
                        c.Añadir();
                        break;
                    case 2:
                        c.ModificarComentario();
                        break;
                    case 3:
                        c.PesarAnimal();
                        break;
                    case 4:
                        c.MostrarFicha();
                        break;
                    case 5:
                        Console.WriteLine("Gracias por utilizar el programa");
                        break;
                }
            } while (opcion != 5);
        
        

        }
    }
}

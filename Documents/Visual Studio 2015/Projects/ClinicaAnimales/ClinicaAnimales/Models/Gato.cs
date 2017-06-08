using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ClinicaAnimales.Interfaces;

namespace ClinicaAnimales.Models
{
    class Gato : Animal,IPesable
    {

        //ATRIBUTOS
        protected string _raza;
        protected string _microchip;


        //CONSTRUCTOR
        public Gato(string _nombre, string _fecha, double _peso, string _comentario, string _raza, string _microchip) : base(_nombre, _fecha, _peso,_comentario)
        {

            this._raza = _raza;
            this._microchip = _microchip;
        }

        //PROPIEDADES
        public string Raza
        {

            get { return _raza; }
        }

        public string MichoChip
        {

            get { return _microchip; }
        }


        //METODOS
        public override void Pesar(double peso)
        {
            Console.WriteLine("El gato pesa: " + peso);
        }

        public override string toString()
        {
            return "Ficha de gato /n" + base.toString() + "/n Raza: " + _raza + "/n ,Microchip: " + _microchip;
        }

       
    }
}

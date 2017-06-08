using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ClinicaAnimales.Interfaces;

namespace ClinicaAnimales.Models
{
    class Pajaro : Animal,IPesable
    {

        //ATRIBUTOS
        protected string _especie;
        protected bool _cantor;


        //CONSTRUCTOR
        public Pajaro(string _nombre, string _fecha, double _peso, string _comentario, string _especie, bool _cantor) : base(_nombre, _fecha, _peso,_comentario)
        {

            this._especie = _especie;
            this._cantor = _cantor;
        }

        //PROPIEDADES
        public string Especie
        {

            get { return _especie; }
        }

        public bool Cantor
        {

            get { return _cantor; }
        }


        //METODOS

        public override void Pesar(double peso)
        {
            Console.WriteLine("El pajaro pesa: " + peso);
        }
        public override string toString()
        {
            return "Ficha de pajaro /n" + base.toString() + "/n Cantor: " + _cantor + "/n ,Especie: " + _especie;
        }

    }
}

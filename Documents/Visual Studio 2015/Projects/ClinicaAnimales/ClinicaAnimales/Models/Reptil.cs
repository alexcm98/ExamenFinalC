using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ClinicaAnimales.Interfaces;

namespace ClinicaAnimales.Models
{
    class Reptil : Animal,IPesable
    {

        //ATRIBUTOS
        protected string _especie;
        protected bool _venenoso;


        //CONSTRUCTOR
        public Reptil(string _nombre, string _fecha, double _peso, string _comentario, string _especie, bool _venenoso) : base(_nombre, _fecha, _peso,_comentario)
        {

            this._especie = _especie;
            this._venenoso = _venenoso;
        }

        //PROPIEDADES
        public string Especie
        {

            get { return _especie; }
        }

        public bool Venenoso
        {

            get { return _venenoso; }
        }


        //METODOS
        public override void Pesar(double peso)
        {
            Console.WriteLine("El reptil pesa: " + peso);
        }
        public override string toString()
        {
            return "Ficha de reptil /n" + base.toString() + "/n Venenoso: " + _venenoso + "/n ,Especie: " + _especie;
        }


    }
}

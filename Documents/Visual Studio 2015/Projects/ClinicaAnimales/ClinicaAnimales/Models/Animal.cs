using ClinicaAnimales.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClinicaAnimales.Models
{
    abstract class Animal : IPesable
    {
        //ATRIBUTOS
        protected string _nombre;
        protected string _fecha;
        protected double _peso;
        protected string _comentario;

        //CONSTRUCTOR
        public Animal(string _nombre, string _fecha, double _peso, string _comentario)
        {
            this._nombre = _nombre;
            this._fecha = _fecha;
            this._peso = _peso;
            this._comentario = _comentario;
        }


        //PROPIEDADES
        public string Nombre
        {

            get{ return _nombre; }
        }


        public string Fecha
        {
           get { return _fecha; }
        }


        public double Peso
        {
           get { return _peso; }
        }


        public string Comentario
        {

            get  { return _comentario; }
        }


        //METODOS

        public abstract void Pesar(double peso);
      


        virtual public string toString()
        {
            return "Nombre: " + _nombre + " /n ,Fecha: " + _fecha + "/n ,Peso: " + _peso + "/n ,Comentario" + _comentario;
        }

       
    }
}

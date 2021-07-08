using System;

namespace ApiCatalogoJogos.Expections
{
    public class JogoJaCadastradoException : Exception
    {
        public JogoJaCadastradoException()
            : base("Este jogo já está cadastrado") 
        { }
    }
}

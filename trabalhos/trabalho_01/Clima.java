package trabalho_01;

import java.util.ArrayList;
import java.util.List;

public class Clima {
    public String ano;
    public String mes;
    public String temperatura;
    public String precipitacao;

    public Clima(String ano, String mes, String temperatura, String precipitacao)
    {
        this.ano = ano;
        this.mes = mes;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }

    //reescreve o toString para exibir um objeto completo da classe
    @Override
    public String toString()
    {
        return "Clima [ ano: "+this.ano+" | mes: "+this.mes+" | temperatura: "+this.temperatura+
                " | precipitação: "+this.precipitacao+" ]";
    }


    // reescreve o equals para definir os atributos identificadores
    @Override
    public boolean equals(Object obj)
    {
        Clima c = (Clima)obj;       // casting para o obj virar clima
        return this.ano.equals(c.ano) && this.mes.equals(c.mes);
    }

    public static ArrayList<String> mesMaisQuente(List<Clima> dados)
    {
        ArrayList<String> lista = new ArrayList<>();
        int maiorTemp = 0;

        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho", "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        for(String mesAtual : meses)
        {
            int maisQuente = 0;

            for(Clima c : dados)
            {
                if(c.mes.equals(mesAtual) && c.temperatura.equals("Quente"))
                {
                    maisQuente++;
                }
            }

            if(maisQuente > maiorTemp)
            {
                maiorTemp = maisQuente;
                lista.clear();
                lista.add(mesAtual);
            }
            else if(maisQuente == maiorTemp)
            {
                lista.add(mesAtual);
            }
        }

        return lista;
    }

    public static ArrayList<String> anoMaisQuente(List<Clima> dados)
    {
        ArrayList<String> lista = new ArrayList<>();
        String[] anos = {"2020", "2021", "2022", "2023", "2024"};

        int maiorQuente = 0;
        int maiorAmeno = 0;
        int maiorFrio = 0;

        for(int i = 0; i < anos.length; i++)
        {
            int quente = 0;
            int ameno = 0;
            int frio = 0;

            for(Clima c : dados)
            {
                if(c.ano.equals(anos[i]))
                {
                    if(c.temperatura.equals("Quente"))
                    {
                        quente++;
                    }
                    else if(c.temperatura.equals("Ameno"))
                    {
                        ameno++;
                    }
                    else if(c.temperatura.equals("Frio"))
                    {
                        frio++;
                    }
                }
            }

            if(quente > maiorQuente || (quente == maiorQuente && ameno > maiorAmeno) || (quente == maiorQuente && ameno == maiorAmeno && frio > maiorFrio))
            {
                lista.clear();
                lista.add(anos[i]);

                maiorQuente = quente;
                maiorAmeno = ameno;
                maiorFrio = frio;
            }
            else if(quente == maiorQuente && ameno == maiorAmeno && frio == maiorFrio)
            {
                lista.add(anos[i]);
            }
        }

        return lista;
    }

    public static ArrayList<String> anoMaisChoveu(List<Clima> dados)
    {
        ArrayList<String> lista = new ArrayList<>();
        String[] anos = {"2020", "2021", "2022", "2023", "2024"};

        int maiorMuita = 0;
        int maiorMedia = 0;
        int maiorPouca = 0;
        int maiorNada = 0;

        for(int i = 0; i < anos.length; i++)
        {
            int muita = 0;
            int media = 0;
            int pouca = 0;
            int nada = 0;

            for(Clima c : dados)
            {
                if(c.ano.equals(anos[i]))
                {
                    if(c.precipitacao.equals("muita"))
                    {
                        muita++;
                    }
                    else if(c.precipitacao.equals("media"))
                    {
                        media++;
                    }
                    else if(c.precipitacao.equals("pouca"))
                    {
                        pouca++;
                    }
                    else if(c.precipitacao.equals("nada"))
                    {
                        nada++;
                    }
                }
            }

            if(muita > maiorMuita || (muita == maiorMuita && media > maiorMedia) || (muita == maiorMuita && media == maiorMedia && pouca > maiorPouca) || (muita == maiorMuita && media == maiorMedia && pouca == maiorPouca && nada > maiorNada))
            {
                lista.clear();
                lista.add(anos[i]);

                maiorMuita = muita;
                maiorMedia = media;
                maiorPouca = pouca;
                maiorNada = nada;
            }
            else if(muita == maiorMuita && media == maiorMedia && pouca == maiorPouca && nada == maiorNada)
            {
                lista.add(anos[i]);
            }
        }

        return lista;
    }
}

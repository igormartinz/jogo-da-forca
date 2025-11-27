import java.util.Random;

public class BancoDePalavras {

    public String palavraAleatoria(int tema) {

        String[] listaPalavras = escolhaTema(tema);

        Random random = new Random();

        return listaPalavras[random.nextInt(listaPalavras.length)];
    }

    private String[] escolhaTema(int tema) {

        switch (tema) {
            case 1:
                String[] animais = {"Elefante", "Girafa", "Gorila", "Raposa", "Canguru", "Jacaré", "Coelho", "Falcão", "Antílope", "Coruja", "Pantera",
                        "Guepardo", "Doninha", "Marreco", "Tartaruga", "Golfinho", "Camaleão", "Lagarto", "Mosquito", "Mariposa", "Libélula", "Pardela",
                        "Ariranha", "Lontra", "Suricato", "Flamingo", "Avestruz", "Babuíno", "Camelo", "Dromedário", "Pelicano", "Albatroz", "Pinguim",
                        "Codorna", "Faisão", "Gavião", "Morcego", "Bisonte", "Canídeo", "Cervídeo", "Felídeo", "Molusco", "Sucuri", "Cascavel", "Jararaca",
                        "Tamanduá", "Formiga", "Gafanhoto", "Besouro", "Rinoceronte"};
                return animais;
            case 2:
                String[] frutas = {"Abacaxi", "Banana", "Goiaba", "Laranja", "Melancia", "Acerola", "Nectarina", "Pitanga", "Cupuaçu", "Jabuticaba",
                        "Rambutan", "Mangaba", "Macauba", "Cambuci", "Grumixama", "Atemoia", "Bacuri", "Buriti", "Carambola", "Ciriguela", "Framboesa",
                        "Guabiroba", "Guarana", "Lichia", "Murici", "Nespera", "Pupunha", "Tamarindo", "Toranja", "Pitomba", "Mangostao", "Cabeludinha",
                        "Jenipapo", "Marmelo", "Damasco", "Maracuja", "Mirtilo", "Biriba", "Graviola", "Groselha", "Feijoa", "Ameixeira"};
                return frutas;
            case 3:
                String[] paises = {"Brasil", "Canadá", "Alemanha", "Espanha", "França", "Itália", "Suécia", "Noruega", "Finlândia", "Portugal", "Bolívia",
                        "Argentina", "Uruguai", "Colômbia", "Austrália", "Dinamarca", "Bélgica", "Hungria", "Polônia", "Bielorrússia", "Rússia", "Ucrânia",
                        "Panamá", "Guiana", "Suriname", "Barbados", "Trinidad", "Jamaica", "Equador", "Eritreia", "Etiópia", "Burundi", "Ruanda", "Somália",
                        "Tunísia", "Namíbia", "Botsuana", "Lesoto", "Essuatíni", "Gâmbia", "Zâmbia", "Zimbábue", "Comores", "Maldivas", "Sérvia", "Albânia",
                        "Croácia", "Romênia", "Bulgária"};
                return paises;
            case 4:
                String[] cores = {"Amarelo","Vermelho","Laranja","Magenta","Castanho","Rosado","Azulada","Esmeralda","Safira","Turquesa","Marinho",
                        "Caramelo","Camurça","Cereja","Chocolate","Coralina","Damasco","Fucsia","Grafite","Jadeado","Lavanda","Malvar","Marfim","Prateado",
                        "Dourado","Púrpura","Escarlate","Ferrugem","Granito","Cinzento","Oliváceo","Pastelão","Salmão","Sanguíneo","Tangerina","Verdete",
                        "Viridiano","Ametista","Anilado","Bordôtinto","Cobalto","Lilasado","Pardento","Rubiado","Serpentina","Turquesado","Ultravioleta",
                        "Verdinho","Azulado","Castanhel"};
                return cores;
            case 5:
                String[] objetos = {"Caderno","Tesoura","Garrafa","Janela","Mochila","Teclado","Armário","Gaveta","Colher","Cadeira","Abajur","Espelho",
                        "Seringa","Travesseiro","Estante","Prateleira","Almofada","Bandeja","Balcão","Caixote","Carimbo","Chaveiro","Cortina","Envelope",
                        "Escova","Estilete","Furadeira","Martelo","Monitor","Notebook","Panela","Prancha","Ralador","Relógio","Torrador","Torneira",
                        "Trincha","Vassoura","Xícara","Enxada","Lixeira","Recepiente","CanecaGrande","Frigideira","Luminária"};
                return objetos;
            case 6:
                String[] times = {"Flamengo","Palmeiras","Corinthians","Cruzeiro","Santos","Athletico","Botafogo","Fortaleza","Juventude","Internacional",
                        "Náutico","Fluminense","Brusque","Capivariano","Chapecoense","Criciuma","Gremio","Londrina","Mirassol","Paulista","Arsenal",
                        "Chelsea","Everton","Juventus","Monaco","Napoli","Granada","Stuttgart","Hannover","Valencia","Cagliari","Dortmund","Hertha",
                        "Feyenoord","Sporting","Salzburg","Spartak","Galatasaray","Besiktas","SevillaFC","Benfica","Porto","Atletico","Villarreal",
                        "RealMadrid","Barcelona","Bordeaux","Marseille","PSG"};
                return times;
                case 7:
                String[] personagens = {"Naruto","Vegeta","Batman","Coringa","Homero","Pikachu","Shaggy","Scooby","Gumball","Mordecai","Ichigo","Sakura",
                        "Sasuke","Hinata","Minato","Jiraiya","Madara","Tsunade","Itachi","Rengoku","Zenitsu","Nezuko","Tanjiro","Gajeel","Zeldris",
                        "Meliodas","Gowther","Escanor","Merlin","Arthur","Percival","Kratos","Danteo","Baymax","Stitch","Rafiki","Rengoku2?","Kenshin",
                        "Voldemort","Severus","Dumbledore","Legolas","Gandalf","FrodoBagg","Samwise","Aragorn","Eowyn","Thranduil"};
                return personagens;
                case 8:
                String[] comidas = {"Lasanha","Feijoada","Macarrão","Empadas","Farofa","Nhoque","Risoto","Pasteis","Brigadeiro","Canjica","Rabada",
                        "Sarapatel","Buchada","Moqueca","Vatapá","Cuscuz","Dobradinha","Mungunzá","Pamonha","Pirarucu","Tapioca","Caruru","Manjar",
                        "Quindim","Almondega","Estrogonofe","Polenta","Feijao","Churrasco","Torresmo","Linguiça","Costela","Bolacha","Biscoito","Pescada",
                        "Sardinha","Salmão","Bacalhau","Pamonha","Pastelão","Gnocchi","Caponata","Escabeche","Camarão","Ratatouille","Carpaccio"};
                return comidas;
            default:
                String[] erro = {"erro"};
                return erro;
        }

    }
}

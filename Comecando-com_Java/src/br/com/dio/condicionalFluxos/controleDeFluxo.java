package br.com.dio.condicionalFluxos;
/*usando if e switch
com if: exiba o nome do mês e do ano de acordo com seu numero.
Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para exibir o texto
"ferias"com switch: use string para a partir do dia da semana, exibir seu número.
Faça outro exemplo onde se uma variavel interta for entre 1 e 3 exibit "certo". se for 4
exibir "errado" e for 5 "talvez" para os demais valores "indefinido"  */
public class controleDeFluxo {
    public static void main(String[] args) {

            ifFlecha();
            ifSemFlecha();
            ifFerias();
            ifMenor();

            switchSemana();
            switchNumero();
            switchFerias();
        }
        public static void ifFlecha() {
            //Representação efeito flecha. Deve ser evitado
            int mes = 9;
            if (mes == 1) {
                System.out.println("Janeiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Sem efeito flecha
        public static void ifSemFlecha() {

            int mes = 9;
            if (mes == 1) {
                System.out.println("Janeiro");
            } else if (mes == 2) {
                System.out.println("Fevereiro");
            } else if (mes == 3) {
                System.out.println("Março");
            } else if (mes == 4) {
                System.out.println("Abril");
            } else if (mes == 5) {
                System.out.println("Maio");
            } else if (mes == 6) {
                System.out.println("Junho");
            } else if (mes == 7) {
                System.out.println("Julho");
            } else if (mes == 8) {
                System.out.println("Agosto");
            } else if (mes == 9) {
                System.out.println("Setembro");
            } else if (mes == 10) {
                System.out.println("Outubro");
            } else if (mes == 11) {
                System.out.println("Novembro");
            } else if (mes == 12) {
                System.out.println("Dezembro");
            }


        }

        //seria melhor utilizando o switch, já que apenas a variavel mês será verificada
        public static void ifFerias() {
            String mes = "Julho";
            if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
                System.out.println("Férias");
            }
        }

        public static void ifMenor() {

            double salarioMensal = 11893.52d;
            double mediaSalarial = 10500d;

            int quantidadeDependentes = 4;
            int mediaDependentes = 2;

            if ((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes)) {
                System.out.println("Funcionário deve receber auxílio.");
            }

            boolean salarioBaixo = salarioMensal < mediaSalarial;
            boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

            if ((salarioBaixo) && (muitosDependentes)) {
                System.out.println("Funcionário deve receber auxílio.");
            }

            boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
            if (recebeAuxilio) {
                System.out.println("Funcionário deve receber auxílio.");
            } else {
                System.out.println("Funcionário não deve receber auxílio.");
            }
        }

        public static void switchSemana() {

            String dia = "Terça";
            switch (dia){
                case "Segunda":
                    System.out.println(2);
                    break;
                case "Terça":
                    System.out.println(3);
                    break;
                case "Quarta":
                    System.out.println(4);
                    break;
                case "Quinta":
                    System.out.println(5);
                    break;
                case "Sexta":
                    System.out.println(6);
                    break;
                case "Sábado":
                    System.out.println(7);
                    break;
                case "Domingo":
                    System.out.println(1);
                    break;
                default:
                    System.out.println("Dia inválido");
                    break;
            }

        }

        public static void switchNumero() {

            int numero =4;
            switch (numero) {
                //só será interrompido após o 3:
                case 1:
                case 2:
                case 3:
                    System.out.println("Certo");
                    break;
                case 4:
                    System.out.println("Errado");
                    break;
                case 5:
                    System.out.println("Talvez");
                    break;
                default:
                    System.out.println("valor indefinido");
                    break;
            }
        }

        public static void switchFerias() {

            String mes = "dezembro";
            switch (mes) {
                case "dezembro":
                case "julho":
                case "janeiro":
                    System.out.println("Férias");
                    break;
                default:
                    System.out.println("mes indefinido");
                    break;
            }
        }

    }

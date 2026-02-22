package exercicios.introducao;

/*
    Você é responsável pelo sistema de um hotel de 3 andares. Cada andar possui 4 quartos.
    A matriz int[][] quartos representa o hotel, onde o valor dentro da célula indica o estado do quarto:
    0: Livre (Não gera receita, disponível).
    1: Ocupado (Gera receita).
    2: Manutenção/Limpeza (Não gera receita e precisa ser contabilizado como custo/indisponibilidade).
    Além disso, cada andar tem um preço base diferente (andares mais altos são mais caros), armazenado no array double[] precosPorAndar.
    Regras de Negócio:
    Check-in Geral: Percorra todo o hotel.
    Receita: Se o quarto estiver Ocupado (1), some o valor da diária daquele andar ao faturamento total.
    Regra VIP: Se o quarto ocupado for no último andar (o mais caro), adicione uma taxa extra de serviço de +15% sobre o valor da diária.
    Alerta de Manutenção: Conte quantos quartos estão em Manutenção (2) por andar. Se um andar tiver 2 ou mais quartos em manutenção, exiba um alerta urgente: "BLOQUEAR ANDAR X PARA REFORMA".
    Relatório: Ao final, mostre o faturamento total e quantos quartos estão livres.
*/
public class Ex15GestaoHoteleira {
    public static void main(String[] args) {
        int[][] hotelRooms = {
                {0, 2, 1, 1},
                {2, 2, 0, 1},
                {1, 1, 0, 1}
        };
        double[] dailyValue = {80.00, 115.00, 150.00};
        double totalRevenue = 0;
        int availableRooms = 0;

        for (int i = 0; i < hotelRooms.length; i++) {
            int occupiedRooms = 0, maintenanceRooms = 0;
            for (int j = 0; j < hotelRooms[i].length; j++) {
                if (hotelRooms[i][j] == 0) {
                    availableRooms += 1;
                } else if (hotelRooms[i][j] == 1) {
                    occupiedRooms += 1;
                } else {
                    maintenanceRooms += 1;
                }
            }

            if (i == 0 || i == 1){
                totalRevenue += occupiedRooms * dailyValue[i];
            } else {
                totalRevenue += occupiedRooms * (dailyValue[i] * 1.15);
            }

            if (maintenanceRooms >= 2){
                System.out.println(">   ALERTA : BLOQUEAR ANDAR " + (i + 1) + " PARA REFORMA!!!!");
            }
        }

        System.out.println("--------------------------");
        System.out.println("RESUMO DIÁRIO DO HOTEL");
        System.out.println("--------------------------");
        System.out.println("FATURAMENTO TOTAL : R$" + totalRevenue);
        System.out.println("QUANTIDADE DE QUARTOS DISPONÍVEIS : " + availableRooms);
    }
}

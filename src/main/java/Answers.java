import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Answers {

    /*Социально-корпоративные  установки самореализации*/
    private List<Integer> OsmTs;
    /*Субъектно-личностные установки самореализации*/
    private List<Integer> OsvTs;
    /*Активность*/
    private List<Integer> aeR;
    /*Инертность*/
    private List<Integer> AR;
    /*Оптимистичность*/
    private List<Integer> ST;
    /*Пессимистичность*/
    private List<Integer> AS;
    /*Интернальность*/
    private List<Integer> IN;
    /*Экстернальность*/
    private List<Integer> aeN;
    /*Социоцентрическая мотивация самореализации*/
    private List<Integer> STs;
    /*Эгоцентрическая мотивация самореализации*/
    private List<Integer> aeTs;
    /*Креативность*/
    private List<Integer> KR;
    /*Консервативность*/
    private List<Integer> KN;
    /*Конструктивность*/
    private List<Integer> KT;
    /*Деструктивность*/
    private List<Integer> DT;
    /*Социальные барьеры*/
    private List<Integer> SB;
    /*Личностные барьеры*/
    private List<Integer> LB;
    /*Шкала искренности*/
    private List<Integer> IT;
    private BufferedWriter writer;
    private double log, OsmTsRes, OsvTsRes, aeRRes, ARRes, STRes, ASRes, INRes, aeNRes, STsRes, aeTsRes, KRRes, KNRes, KTRes, DTRes, SBRes, LBRes, ITRes;

    {
        try {
            writer = new BufferedWriter(new FileWriter("src\\main\\resources\\Output.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        OsmTs = new ArrayList<>();
        OsvTs = new ArrayList<>();
        aeR = new ArrayList<>();
        AR = new ArrayList<>();
        ST = new ArrayList<>();
        AS = new ArrayList<>();
        IN = new ArrayList<>();
        aeN = new ArrayList<>();
        STs = new ArrayList<>();
        aeTs = new ArrayList<>();
        KR = new ArrayList<>();
        KN = new ArrayList<>();
        KT = new ArrayList<>();
        DT = new ArrayList<>();
        SB = new ArrayList<>();
        LB = new ArrayList<>();
        IT = new ArrayList<>();
    }

    public void responseHandler(int numberQue, int button){
        switch (numberQue){
            case 1:
            case 18:
            case 35:
            case 52:
            case 69:
            case 86:
                OsmTs.add(button);
                break;
            case 2:
            case 19:
            case 36:
            case 53:
            case 70:
            case 87:
                OsvTs.add(button);
                break;
            case 3:
            case 20:
            case 37:
            case 54:
            case 71:
            case 88:
                aeR.add(button);
                break;
            case 4:
            case 21:
            case 38:
            case 55:
            case 72:
            case 89:
                AR.add(button);
                break;
            case 5:
            case 22:
            case 39:
            case 56:
            case 73:
            case 90:
                ST.add(button);
                break;
            case 6:
            case 23:
            case 40:
            case 57:
            case 74:
            case 91:
                AS.add(button);
                break;
            case 7:
            case 24:
            case 41:
            case 58:
            case 75:
            case 92:
                IN.add(button);
                break;
            case 8:
            case 25:
            case 42:
            case 59:
            case 76:
            case 93:
                aeN.add(button);
                break;
            case 9:
            case 26:
            case 43:
            case 60:
            case 77:
            case 94:
                STs.add(button);
                break;
            case 10:
            case 27:
            case 44:
            case 61:
            case 78:
            case 95:
                aeTs.add(button);
                break;
            case 11:
            case 28:
            case 45:
            case 62:
            case 79:
            case 96:
                KR.add(button);
                break;
            case 12:
            case 29:
            case 46:
            case 63:
            case 80:
            case 97:
                KN.add(button);
                break;
            case 13:
            case 30:
            case 47:
            case 64:
            case 81:
            case 98:
                KT.add(button);
                break;
            case 14:
            case 31:
            case 48:
            case 65:
            case 82:
            case 99:
                DT.add(button);
                break;
            case 15:
            case 32:
            case 49:
            case 66:
            case 83:
            case 100:
                SB.add(button);
                break;
            case 16:
            case 33:
            case 50:
            case 67:
            case 84:
            case 101:
                LB.add(button);
                break;
            case 17:
            case 34:
            case 51:
            case 68:
            case 85:
            case 102:
                IT.add(button);
                break;

        }
    }

    public void result() throws IOException {
        Logic logic = new Logic();
        Button button = logic.createButton("Завершить", 660, 530);
        scaleResult(log, OsmTsRes, OsvTsRes, aeRRes, ARRes, STRes, ASRes, INRes, aeNRes, STsRes, aeTsRes, KRRes, KNRes, KTRes, DTRes, SBRes, LBRes, ITRes);
        Text text1 = logic.createText(20,50,200, "Социально-корпоративные  установки самореализации", OsmTsRes);
        Text text2 = logic.createText(20,50,250,"Субъектно-личностные установки самореализации", OsvTsRes);
        Text text3 = logic.createText(20,50,300,"Активность", aeRRes);
        Text text4 = logic.createText(20,50,200, "Инертность", ARRes);
        Text text5 = logic.createText(20,50,250,"Оптимистичность", STRes);
        Text text6 = logic.createText(20,50,300,"Пессимистичность", ASRes);
        Text text7 = logic.createText(20,50,200, "Интернальность", INRes);
        Text text8 = logic.createText(20,50,250,"Экстернальность", aeNRes);
        Text text9 = logic.createText(20,50,300,"Социоцентрическая мотивация самореализации", STsRes);
        Text text10 = logic.createText(20,50,200, "Эгоцентрическая мотивация самореализации", aeTsRes);
        Text text11 = logic.createText(20,50,250,"Креативность", KRRes);
        Text text12 = logic.createText(20,50,300,"Консервативность", KNRes);
        Text text13 = logic.createText(20,50,200, "Конструктивность", KTRes);
        Text text14 = logic.createText(20,50,250,"Деструктивность", DTRes);
        Text text15 = logic.createText(20,50,300,"Социальные барьеры", SBRes);
        Text text16 = logic.createText(20,50,200, "Личностные барьеры", LBRes);
        Text text17 = logic.createText(20,50,250,"Шкала искренности", ITRes);
        /*writer.write(String.valueOf(cRes + "\n" + rRes + "\n" + fRes + "\n" + (cRes + rRes + fRes)/3));*/
        writer.close();
        Stage stage = logic.createStage(button, text1, text2, text3, text4, text5, text6, text7, text8, text9,
                                        text10, text11, text12, text13, text14, text15, text16, text17);
        stage.show();
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    LogicDB logicDB = new LogicDB();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.close();
            }
        });
    }

    public void scaleResult(double log,double OsmTsRes,double OsvTsRes,double aeRRes,double ARRes,double STRes,double ASRes,
                            double INRes,double aeNRes,double STsRes,double aeTsRes,
                            double KRRes,double KNRes,double KTRes,double DTRes,double SBRes,double LBRes,double ITRes){
        System.out.println("Курлык scaleResult");
        /*далее проверка вычисление сырых баллов по каждой шкале, через список не сделал осознанно*/
        if(OsmTs.size() > 0) {
            log = 0;
            for (int i : OsmTs) {
                /*Везде суммируются только положительные ответы с индексами 4,5,6*/
                System.out.println("i = "+ i+"Курлык if(OsmTs.get(i) > 3) {");
                if(i > 3) {
                    log += i;
                }
                System.out.println("Курлык после if(OsmTs.get(i) > 3) {");
            }
            OsmTsRes = log;
        }
        if(OsvTs.size() > 0) {
            log = 0;
            for (int i : OsvTs) {
                if(i > 3) {
                    log += i;
                }
            }
            OsvTsRes = log;
        }
        if(aeR.size() > 0) {
            log = 0;
            for (int i : aeR) {
                if(i > 3) {
                    log += i;
                }
            }
            aeRRes = log;
        }
        if(AR.size() > 0) {
            log = 0;
            for (int i : AR) {
                if(i > 3) {
                    log += i;
                }
            }
            ARRes = log;
        }
        if(ST.size() > 0) {
            log = 0;
            for (int i : ST) {
                if(i > 3) {
                    log += i;
                }
            }
            STRes = log;
        }
        if(AS.size() > 0) {
            log = 0;
            for (int i : AS) {
                if(i > 3) {
                    log += i;
                }
            }
            ASRes = log;
        }
        if(IN.size() > 0) {
            log = 0;
            for (int i : IN) {
                if(i > 3) {
                    log += i;
                }
            }
            INRes = log;
        }
        if(aeN.size() > 0) {
            log = 0;
            for (int i : aeN) {
                if(i > 3) {
                    log += i;
                }
            }
            aeNRes = log;
        }
        if(STs.size() > 0) {
            log = 0;
            for (int i : STs) {
                if(i > 3) {
                    log += i;
                }
            }
            STsRes = log;
        }
        if(aeTs.size() > 0) {
            log = 0;
            for (int i : aeTs) {
                if(i > 3) {
                    log += i;
                }
            }
            aeTsRes = log;
        }
        if(KR.size() > 0) {
            log = 0;
            for (int i : KR) {
                if(i > 3) {
                    log += i;
                }
            }
            KRRes = log;
        }
        if(KN.size() > 0) {
            log = 0;
            for (int i : KN) {
                if(i > 3) {
                    log += i;
                }
            }
            KNRes = log;
        }
        if(KT.size() > 0) {
            log = 0;
            for (int i : KT) {
                if(i > 3) {
                    log += i;
                }
            }
            KTRes = log;
        }
        if(DT.size() > 0) {
            log = 0;
            for (int i : DT) {
                if(i > 3) {
                    log += i;
                }
            }
            DTRes = log;
        }
        if(SB.size() > 0) {
            log = 0;
            for (int i : SB) {
                if(i > 3) {
                    log += i;
                }
            }
            SBRes = log;
        }
        if(LB.size() > 0) {
            log = 0;
            for (int i : LB) {
                if(i > 3) {
                    log += i;
                }
            }
            LBRes = log;
        }
        if(IT.size() > 0) {
            log = 0;
            for (int i : IT) {
                if(i > 3) {
                    log += i;
                }
            }
            ITRes = log;
        }
    }

}

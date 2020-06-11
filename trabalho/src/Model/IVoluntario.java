package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Interface de um Voluntário
 * */
public interface IVoluntario extends Serializable {
    /**
     *
     * */
    String getId();

    /**
     *
     * */
    String getPwd();

    /**
     *
     * */
    void setPwd(String pwd);

    /**
     *
     * */
    String getEmail();

    /**
     *
     * */
    void setEmail(String email);

    /**
     *
     * */
    String getNome();

    /**
     *
     * */
    ArrayList<Integer> getRating();

    /**
     *
     * */
    List<String> getHistorico();

    /**
     *
     * */
    void addHistorico(String s);

    /**
     *
     * */
    void setId(String id);

    /**
     *
     * */
    void setNome(String nome);

    /**
     *
     * */
    void setLocalizacaoX(double localizacaoX);

    /**
     *
     * */
    void setLocalizacaoY(double localizacaoY);

    /**
     *
     * */
    void setRange(double range);

    /**
     *
     * */
    double estrela();

    /**
     *
     * */
    double getLocalizacaoX();

    /**
     *
     * */
    double getLocalizacaoY();

    /**
     *
     * */
    double getRange();

    /**
     *
     * */
    void not_available();


    /**
     *
     * */
    boolean check_available();

    /**
     *
     * */
    void available();

    /**
     *
     * */
    void n_encomedas();
}

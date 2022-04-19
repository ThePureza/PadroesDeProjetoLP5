public class RPGCharacterBuild {

    private RPGCharacter rpgCharacter;

    public RPGCharacterBuild() {
        rpgCharacter = new RPGCharacter();
    }

    public RPGCharacter build() {
        if (rpgCharacter.getForca() == 0 || rpgCharacter.getForca() > 20) {
            throw new IllegalArgumentException("Força Inválida");
        }
        if (rpgCharacter.getDestreza() == 0 || rpgCharacter.getDestreza() > 20) {
            throw new IllegalArgumentException("Destreza Inválida");
        }
        if (rpgCharacter.getConstituicao() == 0 || rpgCharacter.getConstituicao() > 20) {
            throw new IllegalArgumentException("Constituição Inválido");
        }
        if (rpgCharacter.getInteligencia() == 0 || rpgCharacter.getInteligencia() > 20) {
            throw new IllegalArgumentException("Inteligência Inválida");
        }
        if (rpgCharacter.getSabedoria() == 0 || rpgCharacter.getSabedoria() > 20) {
            throw new IllegalArgumentException("Sabedoria Inválida");
        }
        if (rpgCharacter.getCarisma() == 0 || rpgCharacter.getCarisma() > 20) {
            throw new IllegalArgumentException("Carisma Inválida");
        }
        if (rpgCharacter.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return rpgCharacter;
    }

    public RPGCharacterBuild setNome(String nome) {
        rpgCharacter.setNome(nome);
        return this;
    }

    public RPGCharacterBuild setClasse(String classe) {
        rpgCharacter.setClasse(classe);
        return this;
    }

    public RPGCharacterBuild setNivel(Integer nivel) {
        rpgCharacter.setNivel(nivel);
        return this;
    }

    public RPGCharacterBuild setAntecedente(String antecedente) {
        rpgCharacter.setAlinhamento(antecedente);
        return this;
    }

    public RPGCharacterBuild setRaca(String raca) {
        rpgCharacter.setRaca(raca);
        return this;
    }

    public RPGCharacterBuild setAlinhamento(String alinhamento) {
        rpgCharacter.setAlinhamento(alinhamento);
        return this;
    }

    public RPGCharacterBuild setForca(Integer forca) {
        rpgCharacter.setForca(forca);
        return this;
    }

    public RPGCharacterBuild setDestreza(Integer destreza) {
        rpgCharacter.setDestreza(destreza);
        return this;
    }

    public RPGCharacterBuild setConstituicao(Integer constituicao) {
        rpgCharacter.setConstituicao(constituicao);
        return this;
    }

    public RPGCharacterBuild setInteligencia(Integer inteligencia) {
        rpgCharacter.setInteligencia(inteligencia);
        return this;
    }

    public RPGCharacterBuild setSabedoria(Integer sabedoria) {
        rpgCharacter.setSabedoria(sabedoria);
        return this;
    }

    public RPGCharacterBuild setCarisma(Integer carisma) {
        rpgCharacter.setCarisma(carisma);
        return this;
    }
}

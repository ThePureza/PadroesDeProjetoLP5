import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RPGCharacterTest {

        @Test
        void deveRetornarExcecaoParaRPGCharacterSemForca() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Força Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterForcaMaior20() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(21)
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Força Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterSemDestreza() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Destreza Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterDestrezaMaior20() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(21)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Destreza Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterSemConstituicao() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setInteligencia(10)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Constituição Inválido", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterConstituicaoMaior20() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setConstituicao(21)
                    .setInteligencia(10)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Constituição Inválido", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterSemInteligencia() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Inteligência Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterInteligenciaMaior20() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setInteligencia(21)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Inteligência Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterSemSabedoria() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Sabedoria Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterSabedoriaMaior20() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setSabedoria(21)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Sabedoria Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterSemCarisma() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setSabedoria(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Carisma Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterCarismaMaior20() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setNome("Pureza")
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setSabedoria(10)
                    .setCarisma(21)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Carisma Inválida", e.getMessage());
            }
        }

        @Test
        void deveRetornarExcecaoParaRPGCharacterSemNome() {
            try {
                RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
                RPGCharacter rpgCharacter = rpgCharacterBuild
                    .setClasse("Paladino")
                    .setForca(10)
                    .setDestreza(10)
                    .setConstituicao(10)
                    .setInteligencia(10)
                    .setSabedoria(10)
                    .setCarisma(10)
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Nome inválido", e.getMessage());
            }
        }

        @Test
        void deveRetornarRPGCharacterValido() {
            RPGCharacterBuild rpgCharacterBuild = new RPGCharacterBuild();
            RPGCharacter rpgCharacter = rpgCharacterBuild
                .setNome("Pureza")
                .setClasse("Paladino")
                .setForca(10)
                .setDestreza(10)
                .setConstituicao(10)
                .setInteligencia(10)
                .setSabedoria(10)
                .setCarisma(10)
                .build();

            assertNotNull(rpgCharacter);
        }
    }
}

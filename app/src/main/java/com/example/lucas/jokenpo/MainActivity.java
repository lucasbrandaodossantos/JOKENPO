package com.example.lucas.jokenpo;
/* DojoPuzzle - Desafio Jokenpo - Código desenvolvido por Lucas Brandão dos Santos 10/08/18
 *
 * JOGADAS POSSÍVEIS:
 *
 * PEDRA X PEDRA = EMPATE
 * PEDRA X PAPEL = PAPEL VENCE
 * PEDRA X TESOURA = PEDRA VENCE
 *
 *
 * PAPEL X PAPEL = EMPATE
 * PAPEL X TESOURA = TESOURA VENCE
 * PAPEL X PEDRA = PAPEL VENCE
 *
 * TESOURA X TESOURA = EMPATE
 * TESOURA X PEDRA = PEDRA VENCE
 * TESOURA X PAPEL = TESOURA VENCE
 *
 *
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int movements [] = new int [3]; //Declarando um vetor de tamanho 3 (3 opções de escolha: Ou pedra ou papel ou tesoura)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final TextView winnertextview = findViewById(R.id.winner_textview); //Textview responsável por exibir o vencedor
        final TextView playertwomove = findViewById(R.id.player_two_move); //Textview responsável por exibir a jogada do player 1
        final TextView playeronemove = findViewById(R.id.player_one_move); //Textview responsável por exibir a jogada do player 2

        Button btnplay = findViewById(R.id.btn_play); //Botão para iniciar o jogo

        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random_move = new Random();
                int r;
                for (int i = 0; i <= movements.length; i++){

                            r = random_move.nextInt(movements.length);
                            playeronemove.setText(String.valueOf(r));
                            r = random_move.nextInt(movements.length);
                            playertwomove.setText(String.valueOf(r));

                            /* Pedra = 0,
                             * Papel = 1,
                             * Tesoura = 2
                                         */
                                if (playeronemove.getText().toString().equals("0") && playertwomove.getText().toString().equals("0")){
                                    playeronemove.setText(R.string.pedra);
                                    playertwomove.setText(R.string.pedra);
                                    winnertextview.setText(R.string.empate);

                                }else if (playeronemove.getText().toString().equals("0") && playertwomove.getText().toString().equals("1")){
                                    playeronemove.setText(R.string.pedra);
                                    playertwomove.setText(R.string.papel);
                                    winnertextview.setText(R.string.playerdoisganha);

                                }else if (playeronemove.getText().toString().equals("0") && playertwomove.getText().toString().equals("2")){
                                    playeronemove.setText(R.string.pedra);
                                    playertwomove.setText(R.string.tesoura);
                                    winnertextview.setText(R.string.playerumganha);

                                }else if (playeronemove.getText().toString().equals("1") && playertwomove.getText().toString().equals("1")){
                                    playeronemove.setText(R.string.papel);
                                    playertwomove.setText(R.string.papel);
                                    winnertextview.setText(R.string.empate);

                                }else if (playeronemove.getText().toString().equals("1") && playertwomove.getText().toString().equals("0")){
                                    playeronemove.setText(R.string.papel);
                                    playertwomove.setText(R.string.pedra);
                                    winnertextview.setText(R.string.playerumganha);

                                }else if (playeronemove.getText().toString().equals("1") && playertwomove.getText().toString().equals("2")){
                                    playeronemove.setText(R.string.papel);
                                    playertwomove.setText(R.string.tesoura);
                                    winnertextview.setText(R.string.playerdoisganha);

                                }else if (playeronemove.getText().toString().equals("2") && playertwomove.getText().toString().equals("2")){
                                    playeronemove.setText(R.string.tesoura);
                                    playertwomove.setText(R.string.tesoura);
                                    winnertextview.setText(R.string.empate);

                                }else if (playeronemove.getText().toString().equals("2") && playertwomove.getText().toString().equals("0")){
                                    playeronemove.setText(R.string.tesoura);
                                    playertwomove.setText(R.string.pedra);
                                    winnertextview.setText(R.string.playerdoisganha);

                                }else if (playeronemove.getText().toString().equals("2") && playertwomove.getText().toString().equals("1")){
                                    playeronemove.setText(R.string.tesoura);
                                    playertwomove.setText(R.string.papel);
                                    winnertextview.setText(R.string.playerumganha);
                                }



                    }
            }
        });
    }
}

package main;

import com.eudycontreras.othello.capsules.AgentMove;
import com.eudycontreras.othello.controllers.Agent;
import com.eudycontreras.othello.controllers.AgentController;
import com.eudycontreras.othello.enumerations.PlayerTurn;
import com.eudycontreras.othello.models.GameBoardState;
import com.eudycontreras.othello.utilities.GameTreeUtility;

public class AlphaBetaAgent extends Agent {

    public AlphaBetaAgent() {
        super(PlayerTurn.PLAYER_ONE);
        // TODO Auto-generated constructor stub
    }

    private AlphaBetaAgent(PlayerTurn playerTurn) {
        super(playerTurn);
        // TODO Auto-generated constructor stub
    }

    @Override
    public AgentMove getMove(GameBoardState gameState) {
        return AgentController.findUltimateMove(this,gameState, playerTurn);
    }
}

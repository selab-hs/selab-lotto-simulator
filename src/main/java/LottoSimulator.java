import controller.LottoController;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import model.User;
import view.InitView;
import view.OutView;

public class LottoSimulator {

  InitView init = new InitView();
  OutView out = new OutView();

  LottoController lottoController = new LottoController();
  public void startLottoSimulator() throws IOException {
    while(true){
      init.lottoMenu(init.startView());
      out.answerView(lottoController.setLottoSimulator());
      Map<Integer, List<User>> result = lottoController.results(init.getOption());
      out.startResultView();
      for(Entry<Integer,List<User>> elem : result.entrySet()){
        out.rank(elem.getKey(), elem.getValue());
      }
      out.endResultView();
    }
  }
}



package result;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/resultservlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hno=request.getParameter("hno");
		ConCodeWritten ccw=new ConCodeWritten();
		ConCodePrac ccp=new ConCodePrac();
		ResultDataWritten rdw=ccw.getWrittenResult(hno);
		ResultDataPrac rdp=ccp.getPracResult(hno);
		if(rdw!=null && rdp!=null)
		{
			request.setAttribute("WrittenResult",rdw);
			request.setAttribute("PracResult",rdp);
			RequestDispatcher rd=request.getRequestDispatcher("/resultpage.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message","Invalid Hall Ticket Number");
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}
	}

}

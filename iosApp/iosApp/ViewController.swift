import UIKit
import app

class ViewController: UIViewController, EventListView {
    
    private lazy var presenter = ServiceLocator.init().eventListPresenter
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        presenter.attachView(view: self)
    }
    
    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillDisappear(animated)
        presenter.detachView()
    }
    
    func renderEventList(eventList: [EventModel]) {
        for event in eventList {
            label.text = (label.text ?? "") + event.title + ", "
        }
    }
    
    func renderError(errorMessage: String) {
        print(errorMessage)
    }
    
    func renderLoading(visible: Bool) {
        print("Setting loading visible \(visible)")
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    @IBOutlet weak var label: UILabel!
}


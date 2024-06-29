import { Box } from "@mui/material";
import Header from "~/components/Header";
import PieChart from "~/components/PieChart";

function PiePage() {
    return (<Box>
        <Header title='PIE CHART' subtitle='Create new pie'/>
        <Box sx={{width: '100%', height: '75vh'}}>
            <PieChart />
        </Box>
    </Box>  );
}

export default PiePage;